import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Output {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String var0;
        String tmp0;
        tmp0 = "123";
        var0 = tmp0;
        Double tmp1 = Double.valueOf(var0);
        System.out.println(tmp1);
        Integer tmp2 = Integer.valueOf(var0);
        System.out.println(tmp2);
        int var1;
        int tmp3;
        tmp3 = 5;
        var1 = tmp3;
        double var2;
        double tmp4 = (double) var1;
        var2 = tmp4;
        int tmp6 = (int) var2;
        int tmp5 = var1 + tmp6;
        System.out.println(tmp5);
        String tmp9 = String.valueOf(var1);
        String tmp10;
        tmp10 = " ";
        String tmp8 = tmp9 + tmp10;
        String tmp11 = String.valueOf(var2);
        String tmp7 = tmp8 + tmp11;
        System.out.println(tmp7);
        Set<Integer> var3 = new HashSet<>();
        String tmp12;
        tmp12 = "1,2,3,4,5,6";
        Set<Integer> tmp13 = new HashSet<>();
        for (String s : tmp12.split(",")) {
            tmp13.add(Integer.parseInt(s));
        }
        var3 = tmp13;
        String tmp15;
        tmp15 = "Set: ";

        String tmp14 = tmp15 + var3;
        System.out.println(tmp14);
        Set<Integer> var4 = new HashSet<>();
        Set<Integer> tmp16 = new HashSet<>();
        int tmp17;
        tmp17 = 1;
        tmp16.add(tmp17);
        int tmp18;
        tmp18 = 2;
        tmp16.add(tmp18);
        int tmp19;
        tmp19 = 3;
        tmp16.add(tmp19);
        var4 = tmp16;
        String tmp21;
        tmp21 = "Set: ";

        String tmp20 = tmp21 + var4;
        System.out.println(tmp20);
        int var5;
        int tmp22;
        tmp22 = 5;
        var5 = tmp22;
        String tmp24;
        tmp24 = "Another: ";
        Set<Integer> tmp25 = new HashSet<>();
        int tmp27;
        tmp27 = 3;
        int tmp28 = var5 * tmp27;
        int tmp29;
        tmp29 = 2;
        int tmp30 = tmp28 / tmp29;
        int tmp31;
        tmp31 = 3;
        int tmp26 = tmp30 - tmp31;
        tmp25.add(tmp26);
        tmp25.add(var5);
        String tmp23 = tmp24 + tmp25;
        System.out.println(tmp23);
        Set<Integer> var6 = new HashSet<>();
        Set<Integer> tmp33 = new HashSet<>();
        int tmp34;
        tmp34 = 1;
        tmp33.add(tmp34);
        int tmp35;
        tmp35 = 2;
        tmp33.add(tmp35);
        int tmp36;
        tmp36 = 3;
        tmp33.add(tmp36);
        Set<Integer> tmp37 = new HashSet<>();
        int tmp38;
        tmp38 = 4;
        tmp37.add(tmp38);
        int tmp39;
        tmp39 = 5;
        tmp37.add(tmp39);
        int tmp40;
        tmp40 = 6;
        tmp37.add(tmp40);
        Set<Integer> tmp32 = new HashSet<>();
        tmp32.addAll(tmp33);
        tmp32.addAll(tmp37);
        var6 = tmp32;
        Set<Integer> tmp42 = new HashSet<>();
        int tmp43;
        tmp43 = 1;
        tmp42.add(tmp43);
        int tmp44;
        tmp44 = 2;
        tmp42.add(tmp44);
        int tmp45;
        tmp45 = 7;
        tmp42.add(tmp45);

        Set<Integer> tmp41 = new HashSet<>();
        tmp41.addAll(tmp42);
        tmp41.addAll(var6);
        System.out.println(tmp41);
        System.out.println(var6);
        Set<Integer> tmp48 = new HashSet<>();
        int tmp49;
        tmp49 = 1;
        tmp48.add(tmp49);
        int tmp50;
        tmp50 = 5;
        tmp48.add(tmp50);
        int tmp51;
        tmp51 = 3;
        tmp48.add(tmp51);
        Set<Integer> tmp52 = new HashSet<>();
        int tmp53;
        tmp53 = 4;
        tmp52.add(tmp53);
        int tmp54;
        tmp54 = 5;
        tmp52.add(tmp54);
        int tmp55;
        tmp55 = 6;
        tmp52.add(tmp55);
        Set<Integer> tmp56 = new HashSet<>();
        tmp56.addAll(tmp48);
        tmp56.retainAll(tmp52);
        String tmp57;
        tmp57 = "test";
        String tmp47 = tmp56 + tmp57;
        System.out.print("Enter a number: ");
        String tmp58 = sc.nextLine();
        String tmp46 = tmp47 + tmp58;
        System.out.println(tmp46);
        int tmp60;
        tmp60 = 5;
        int tmp61 = -tmp60;
        int tmp66;
        Set<Integer> tmp62 = new HashSet<>();
        int tmp63;
        tmp63 = 4;
        tmp62.add(tmp63);
        int tmp64;
        tmp64 = 5;
        tmp62.add(tmp64);
        int tmp65;
        tmp65 = 6;
        tmp62.add(tmp65);
        tmp66 = tmp62.size();
        int tmp59 = tmp61 + tmp66;
        System.out.println(tmp59);
        int tmp67;
        tmp67 = 5;
        int tmp68 = +tmp67;
        System.out.println(tmp68);
        int tmp76;
        tmp76 = 1;
        int tmp77;
        tmp77 = 3;
        int tmp75 = tmp76 + tmp77;
        int tmp78;
        tmp78 = 2;
        int tmp79;
        tmp79 = 3;
        int tmp80 = tmp78 * tmp79;
        int tmp74 = tmp75 + tmp80;
        int tmp81;
        tmp81 = 4;
        int tmp82;
        tmp82 = 2;
        int tmp83 = tmp81 / tmp82;
        int tmp73 = tmp74 + tmp83;
        int tmp84;
        tmp84 = 5;
        int tmp85;
        tmp85 = 2;
        int tmp86 = tmp84 / tmp85;
        int tmp72 = tmp73 + tmp86;
        int tmp87;
        tmp87 = 6;
        int tmp88;
        tmp88 = 2;
        int tmp89 = tmp87 % tmp88;
        int tmp71 = tmp72 + tmp89;
        int tmp90;
        tmp90 = 7;
        int tmp70 = tmp71 + tmp90;
        int tmp91;
        tmp91 = 2;
        int tmp69 = tmp70 - tmp91;
        System.out.println(tmp69);
        double tmp93;
        tmp93 = 1.0;
        double tmp94 = -tmp93;
        double tmp95;
        tmp95 = 1.9;
        double tmp92 = tmp94 + tmp95;
        System.out.println(tmp92);
        String tmp98;
        tmp98 = "Hello";
        String tmp99;
        tmp99 = " ";
        String tmp97 = tmp98 + tmp99;
        String tmp100;
        tmp100 = "World";
        String tmp96 = tmp97 + tmp100;
        System.out.println(tmp96);
    }
}