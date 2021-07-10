package design.patterns.creator.builder.builderhouse;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildBasis();
        builder.buildWall();
        builder.buildRoof();
        return builder.getProduct();
    }
}
