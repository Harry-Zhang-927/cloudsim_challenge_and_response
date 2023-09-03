package org.cloudbus.cloudsim;

import org.cloudbus.cloudsim.ChallengeListener;

import java.util.List;

public class CustomedDatacenter extends Datacenter implements ChallengeListener {

    /**
     * Allocates a new PowerDatacenter object.
     *
     * @param name               the name to be associated with this entity (as required by Sim_entity class from
     *                           simjava package)
     * @param characteristics    an object of DatacenterCharacteristics
     * @param vmAllocationPolicy the vmAllocationPolicy
     * @param storageList        a LinkedList of storage elements, for data simulation
     * @param schedulingInterval
     * @throws Exception This happens when one of the following scenarios occur:
     *                   <ul>
     *                   <li>creating this entity before initializing CloudSim package
     *                   <li>this entity name is <tt>null</tt> or empty
     *                   <li>this entity has <tt>zero</tt> number of PEs (Processing Elements). <br>
     *                   No PEs mean the Cloudlets can't be processed. A CloudResource must contain one or
     *                   more Machines. A Machine must contain one or more PEs.
     *                   </ul>
     * @pre name != null
     * @pre resource != null
     * @post $none
     */
    public CustomedDatacenter(String name, DatacenterCharacteristics characteristics, VmAllocationPolicy vmAllocationPolicy, List<Storage> storageList, double schedulingInterval) throws Exception {
        super(name, characteristics, vmAllocationPolicy, storageList, schedulingInterval);
    }

    /**
     * Created a new DatacenterBroker object.
     *
     * @param name name to be associated with this entity (as required by Sim_entity class from
     *             simjava package)
     * @throws Exception the exception
     * @pre name != null
     * @post $none
     */

    @Override
    public void onChallengeReceived(String challenge) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_RED + "Challenge received: " + challenge + ANSI_RESET);
        System.out.println("Responding to challenge...");
    }
}
