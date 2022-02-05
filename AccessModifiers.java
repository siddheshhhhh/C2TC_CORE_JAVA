class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password=pass;
    }
}
class AccessModifiers {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Sid";
        a1.email="sid@gamil.com";
        a1.setPassword("abdce");
        System.out.println(a1.getPassword());
    }
}