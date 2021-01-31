package secret;

public class TreeRepresentation {
    String name;
    Boolean isOak;
    Double height;

    public TreeRepresentation(String name, Boolean isOak, Double height) {
        this.name = name;
        this.isOak = isOak;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Boolean isOak() {
        return isOak;
    }

    public Double getHeight() {
        return height;
    }
}
