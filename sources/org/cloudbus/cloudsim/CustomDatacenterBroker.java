package org.cloudbus.cloudsim;

import org.cloudbus.cloudsim.ChallengeListener;
import org.cloudbus.cloudsim.DatacenterBroker;

import java.util.ArrayList;
import java.util.List;

public class CustomDatacenterBroker extends DatacenterBroker {
    private List<ChallengeListener> challengeListeners = new ArrayList<>();

    /**
     * Created a new DatacenterBroker object.
     *
     * @param name name to be associated with this entity (as required by Sim_entity class from
     *             simjava package)
     * @throws Exception the exception
     * @pre name != null
     * @post $none
     */
    public CustomDatacenterBroker(String name) throws Exception {
        super(name);
    }

    // ... existing code ...

    public void addChallengeListener(ChallengeListener listener) {
        challengeListeners.add(listener);
    }

    public void sendChallengeToDatacenter(String challenge) {
        System.out.println("Sending challenge: " + challenge);
        for (ChallengeListener listener : challengeListeners) {
            listener.onChallengeReceived(challenge);
        }
    }
}

