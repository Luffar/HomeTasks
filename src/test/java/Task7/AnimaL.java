package Task7;

public abstract class AnimaL {

    private String name;

    public String getName() {
        return name;
    }

    public AnimaL(String name) {
        this.name = name;
    }

    abstract void greets();
}
