package com.java.designpattrn.principle.LOD.ex3;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class InstallSoftware {

    public void installWizard(Wizard wizard) {
        int first = wizard.first();
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();
                if (third > 50) {
                    wizard.first();
                }
            }
        }
    }

}
