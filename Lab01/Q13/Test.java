class buyer {
    private String name;
    public buyer(String name) {
        this.name = name;
    }
    public void buy(String thing) {
        System.out.println(name + " 买了 " + thing);
    }
}
class chef {
    private String name;
    public chef(String name) {
        this.name = name;
    }
    public void cook(String thing) {
        System.out.println(name + " 做好了 " + thing);
    }
}

public class Test {
    public static void main(String[] args) {
        buyer aunt = new buyer("姑姑");
        buyer mom = new buyer("妈妈");
        buyer self = new buyer("自己");

        chef dad = new chef("爸爸");
        chef auntie = new chef("婶婶");

        aunt.buy("鱼");
        mom.buy("羊肉");
        self.buy("蔬菜");

        dad.cook("葱爆羊肉");
        auntie.cook("豆腐鱼汤");
    }
}
