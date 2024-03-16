FROM eclipse-temurin:11-jre

RUN apt-get update && \
    apt-get install -y \
    gawk \
    bc \
    sudo \
    unzip \
    build-essential \
    man-db \
    graphviz \
    expect
# Run unminimize to restore manpages
RUN yes | unminimize
# Copy antlr4-install.zip and expect script to /tmp inside the container
COPY antlr4-install.zip /tmp/
COPY expect_script.exp /tmp/
# Unzip antlr4-install.zip
RUN unzip /tmp/antlr4-install.zip -d /tmp && \
    rm /tmp/antlr4-install.zip && \
    mv /tmp/expect_script.exp /tmp/antlr4-install/
# Create a non-root user and add to sudo group
RUN groupadd -r antlr4 && \
    useradd -r -g antlr4 antlr4 && \
    adduser antlr4 sudo && \
    mkdir -p /home/antlr4 && \
    echo 'antlr4:pass' | chpasswd
RUN mkdir -p /bin/classes
# Give appropriate permissions
RUN chown -R antlr4:antlr4 /home/antlr4 /tmp /tmp/antlr4-install /bin/classes
# Change ownership of the extracted folder to the newly created user
USER antlr4
# Set working directory to the extracted folder
WORKDIR /tmp/antlr4-install
# Make scripts executable
RUN chmod +x install.sh expect_script.exp
# Run the expect script
RUN ./expect_script.exp
# Set environment variables
ENV CLASSPATH=".:/usr/local/lib/antlr-4.13.1-complete.jar:/usr/local/lib/ST-4.3.4.jar"
ENV ANTLR4_PATH="/usr/local/lib"

COPY classes/TerminalAST.java classes/MyCustomListener.java /tmp/antlr4-install/
RUN javac -d /bin/classes /tmp/antlr4-install/TerminalAST.java /tmp/antlr4-install/MyCustomListener.java

# Clean up temporary directory
RUN rm -rf /tmp/antlr4-install

WORKDIR /workspace

CMD ["/bin/bash"]
