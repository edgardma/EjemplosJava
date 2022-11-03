package pe.com.dyd.example.hexagonal.consola;

import pe.com.dyd.example.hexagonal.application.MembershipManager;
import pe.com.dyd.example.hexagonal.common.MembershipRepository;
import pe.com.dyd.example.hexagonal.persistence.InMemoryMembershipRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MembershipRepository repository = new InMemoryMembershipRepository();
        MembershipManager manager = new MembershipManager(repository);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Add new member\n2. Exit");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Member ID:");
                int memberId = scanner.nextInt();
                System.out.println("Member Name:");
                String name = scanner.next();

                boolean memberAdded = manager.registerNewMember(memberId, name);
                System.out.println("Member added: " + memberAdded);
            }
        } while (option == 1);
    }
}