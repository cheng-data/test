package com.jason.juc.proxy;

public class XiMenQing {

    public static void main(String[] args) {

//        WangPo wangPo = new WangPo();
//         wangPo.playWithMan();
//         wangPo.makeEyesWithMen();


        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.makeEyesWithMen();
        wangPo1.playWithMan();


    }

}
