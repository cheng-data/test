package com.jason.juc.proxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    public void makeEyesWithMen() {
        this.kindWomen.makeEyesWithMen();
    }

    public void playWithMan() {
        this.kindWomen.playWithMan();
    }
}
