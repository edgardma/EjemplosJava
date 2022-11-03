package pe.com.dyd.example.hexagonal.common;

public interface MembershipRepository {
    boolean isRegistered(int membershipId);

    void registerMember(int membershipId, String name);
}
