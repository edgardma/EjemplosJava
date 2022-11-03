package pe.com.dyd.example.hexagonal.persistence;

import pe.com.dyd.example.hexagonal.common.MembershipRepository;

import java.util.AbstractMap;
import java.util.HashMap;

public class InMemoryMembershipRepository implements MembershipRepository {

    private AbstractMap<Integer, String> members;

    public InMemoryMembershipRepository() {
        members = new HashMap<Integer, String>();
    }

    @Override
    public boolean isRegistered(int membershipId) {
        return members.containsKey(membershipId);
    }

    @Override
    public void registerMember(int membershipId, String name) {
        members.put(membershipId, name);
    }
}
