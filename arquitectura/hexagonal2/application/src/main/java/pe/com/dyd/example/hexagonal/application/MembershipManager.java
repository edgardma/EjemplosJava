package pe.com.dyd.example.hexagonal.application;

import pe.com.dyd.example.hexagonal.common.MembershipRepository;

public class MembershipManager {
    private MembershipRepository repository;

    public MembershipManager (MembershipRepository repository) {
        this.repository = repository;
    }

    public boolean registerNewMember(int membershipId, String name) {
        boolean result = false;

        if(!repository.isRegistered(membershipId) && name != null) {
            repository.registerMember(membershipId, name);
            result = true;
        }

        return result;
    }

}
