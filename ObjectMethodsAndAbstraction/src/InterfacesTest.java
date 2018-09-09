package classes;

import classes.Implementations.HumanResourceImpl;
import classes.Interfaces.HumanResourceAgreement;

/**
 * Created by Elimane on Sep, 2018, at 14:26
 */
public class InterfacesTest {

    public static void main(String[] args)
    {
        HumanResourceAgreement humanResource  = new HumanResourceImpl();
        HumanResourceAgreement humanResource2  = new HumanResourceImpl();

        HumanResourceAgreement[] humans = new HumanResourceAgreement[2];
        humans[0] = humanResource;
        humans[1] = humanResource2;

        for (HumanResourceAgreement element : humans)
        {
            humanResource.applyForSocialSecurity();
        }


    }
}
