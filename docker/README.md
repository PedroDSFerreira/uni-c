# Docker Image for ANTLR4

This Docker image contains version 4.13.1 of **ANTLR4** and some custom scripts.

## Docker Image

The image uses the [eclipse-temurin:11-jre](https://hub.docker.com/_/eclipse-temurin/tags?page=1&name=11-jre&ordering=-name) image for a **Java runtime environment**.

## Build

You can build docker image from source code locally.

```bash
git clone https://github.com/PedroDSFerreira/uni-c.git
cd uni-c/docker
docker build -t antlr4 .
```

You also can pull the image from the container registry:

```bash
docker pull ghcr.io/pedrodsferreira/antlrantlr4
docker tag ghcr.io/pedrodsferreira/antlr4:latest antlr4
```

## Run

For security reasons is **ANTLR4 Docker image** designed to run in the current folder only, so a container doesn't have any access to any other folders on a host system. Since this is a transparent call of Docker image from command line, where new files are generated, it is also a good idea to execute code inside a Docker as a non root user and match it to the host caller.

Calling a dockerized ANTLR4 image can look like this:

```shell
wget https://raw.githubusercontent.com/antlr/grammars-v4/master/json/JSON.g4
docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v `pwd`:/workspace antlr4 -Dlanguage=Go JSON.g4
```

## Integration as alias

      alias antlr4='docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v `pwd`:/workspace antlr4 $@'

## Custom Scripts

### antlr4-test [<grammar> <rule>] [options]

Tests the ANTLR4 <grammar> starting at rule <rule>. Arguments <grammar> <rule> may be omitted if there is only one grammar in the directory (and eventual subdirectories), and the first symbol in the grammar is the desired <rule> symbol.

#### Principal Options:
- `-h`, `-help`: Display help page.
- `-gui`: Show the syntax tree.
- `-tokens`: Show the tokens.

### antlr4-clean [-h | -help | -cpp | -python | -java] [grammar]

Cleans automatically generated ANTLR4 files considering the target language.

#### Target Language:
- `-java`: Java (default).
- `-cpp`: C++.
- `-python`: Python3.

### antlr4-main [options] [<GrammarName> <mainRule>]

Creates a main class in the target language to parse <GrammarName> starting at rule <mainRule>. Arguments <GrammarName> <mainRule> may be omitted if there is only one grammar in the directory (and eventual subdirectories), and the first symbol in the grammar is the <mainRule> symbol.

#### Target Language Options:
- `-java`: Java (default).
- `-cpp`: C++.
- `-python`: Python3.

#### Other Options:
- `-l <ListenerFile>`, `-listener <ListenerFile>`: Main created with support for traversing the given listener class.
- `-v <VisitorFile>`, `-visitor <VisitorFile>`: Main created with support for visiting the given visitor class.
- `-i`, `-line-interactive`: Main created for a line interactive interpreter.
- `-is <Separator>`, `-separator-interactive <Separator>`: Main created for a text separated interactive parser.
- `-indent <N>`: Number of indentation spaces (default: 3).
- `-f`, `-force`: Force creation of the main file even if grammar, rule, listeners, and visitors don't exist, or if the main file already exists.

### antlr4-visitor [-h | -help] [-cpp [inline] | -python | -java] [-f | -force] [<grammar>] <visitor-class-name> <visitor-type>

Creates a visitor class named <visitor-class-name> in the target language for <grammar>. Type instance of base generic visitor class will be <visitor-type>. Argument <grammar> may be omitted if there is only one grammar in the directory (and eventual subdirectories).

#### Target Language:
- `-java`: Java (default).
- `-cpp`: C++.
- `-cpp inline`: C++ with inline implementation (implementation in *.h class definition).
- `-python`: Python3.

#### Options:
- `-f`, `-force`: Force creation of the visitor file.
- `-i <N>`, `-indent <N>`: Number of indentation spaces (default: 3).
- `-l`, `-log`: Add method log stdout print.

### antlr4-listener [-h | -help] [-cpp [inline] | -python | -java] [-f | -force] [<grammar>] <listener-class-name>

Creates a listener class named <listener-class-name> in the target language for <grammar>. Argument <grammar> may be omitted if there is only one grammar in the directory (and eventual subdirectories).

#### Target Language:
- `-java`: Java (default).
- `-cpp`: C++.
- `-cpp inline`: C++ with inline implementation (implementation in *.h class definition).
- `-python`: Python3.

#### Options:
- `-f`, `-force`: Force creation of the listener file.
- `-i <N>`, `-indent <N>`: Number of indentation spaces (default: 3).
- `-l`, `-log`: Add method log stdout print.

### antlr4-build [-h | -help | -cpp | -python | -java] [grammar]

Finds all existing *.g4 grammars in the current directory or in subdirectories. If no grammar argument exists, and if successful and if applicable, compiles the generated target language code.

#### Target Language:
- `-java`: Java (default).
- `-cpp`: C++.
- `-python`: Python3.

### antlr4-run [-h | -help | -cpp | -python | -java]

Runs the compiler present in the current directory or in a subdirectory (fails if none exists, or if there are more than one). Accepts program files as arguments (uses stdin if no argument is passed).

#### Target Language:
- `-java`: Java (default).
- `-cpp`: C++.
- `-python`: Python3.

### antlr4-jar-run

Run a jar file (including ANTLR jars).

### antlr4-javac

Java compiler (ANTLR jar in CLASSPATH).

### antlr4-java

Java virtual machine (ANTLR jar in CLASSPATH).

### java-clean

Delete binary java files.
