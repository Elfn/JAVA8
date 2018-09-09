package classes.Implementations;

import classes.Interfaces.HumanResourceAgreement;

/**
 * Created by Elimane on Sep, 2018, at 14:24
 */
public  class HumanResourceImpl implements HumanResourceAgreement {
    @Override
    public String getLeaveRequest(String id) {
        return null;
    }

    @Override
    public float[] getWorkerSalary() {
        return new float[0];
    }

    @Override
    public void applyForSocialSecurity() {

        System.out.println("Apply for social security!");

    }
}
