package design.patterns.structure.adapter;

public class ForeignSocketAdapter extends ForeignSocket implements ChineseSocket{

    @Override
    public void setChinesePlug() {
        setForeignPlug();
    }
}
