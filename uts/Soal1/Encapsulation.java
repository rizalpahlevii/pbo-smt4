public class ParentClass {
    private String myProp;

    public int getProperty() {
        return myProp;
    }

    public void setProperty(String myProp) {
        this.myProp = myProp;
    }

}

class Main {
    public static void main(String[] args) {
        ParentClass object = new ParentClass();
        object.setProperty("This is test parse a param");
        System.out.println(object.getProperty());
    }
}
