public class Dog {

    String name;
    boolean isHungry;
    String offSpring;
    String owner;

    public String getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String offSpring) {
        this.offSpring = offSpring;
    }

    public Dog(String _name, boolean _isHungry) {
        this.name = _name;
        this.isHungry = _isHungry;
    }
    public boolean feedDog(){
        if(isHungry==true){
            isHungry=false;
        }
        return isHungry;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
