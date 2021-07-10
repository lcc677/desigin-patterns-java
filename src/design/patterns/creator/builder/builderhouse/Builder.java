package design.patterns.creator.builder.builderhouse;

public interface Builder {
    void buildBasis();
    void buildWall();
    void buildRoof();
    House getProduct();

}
