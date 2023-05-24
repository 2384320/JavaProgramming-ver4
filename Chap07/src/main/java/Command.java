public class Command {
    private String com, var1, var2;

    public Command(String com, String var1, String var2) {
        this.com = com;
        this.var1 = var1;
        this.var2 = var2;
    }

    public String getCom() {
        return com;
    }

    public String getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }
}
