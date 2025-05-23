package com.unicesumar;

import com.unicesumar.entities.Product;
import com.unicesumar.entities.User;
import com.unicesumar.repository.ProductRepository;
import com.unicesumar.repository.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProductRepository listaDeProdutos = null;
        UserRepository listaDeUsuarios = null;
        Connection conn = null;
        
        // Parâmetros de conexão
        String url = "jdbc:sqlite:database.sqlite";

        // Tentativa de conexão
        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
                listaDeProdutos = new ProductRepository(conn);
                listaDeUsuarios = new UserRepository(conn);
            } else {
                System.out.println("Falha na conexão.");
                System.exit(1);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n---MENU---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listas Produtos");
            System.out.println("3 - Cadastrar Usuário");
            System.out.println("4 - Listar Usuários");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar Produto");
                    listaDeProdutos.save(new Product("Teste", 10));
                    listaDeProdutos.save(new Product("Computador", 3000));
                    break;
                case 2:
                    System.out.println("Listar Produtos");
                    List<Product> products = listaDeProdutos.findAll();
                    products.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Cadastrar Usuário");
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String password = scanner.nextLine();
                    scanner.nextLine();
                    User newUser = new User(UUID.randomUUID(), name, email, password);
                    listaDeUsuarios.save(newUser);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 4:
                    System.out.print("Digite o ID do usuário (ou pressione Enter para listar todos): ");
                    String userIdInput = scanner.nextLine();
                    if (userIdInput.isEmpty()) {
                        List<User> users = listaDeUsuarios.findAll();
                        users.forEach(System.out::println);
                    } else {
                        try {
                            UUID userId = UUID.fromString(userIdInput);
                            Optional<User> user = listaDeUsuarios.findById(userId);
                            if (user != null) {
                                System.out.println(user);
                                System.out.print("Deseja deletar este usuário? (1 - Sim / 0 - Não): ");
                                int deleteOption = scanner.nextInt();
                                scanner.nextLine();
                                scanner.nextLine();
                                scanner.nextLine();
                                if (deleteOption == 1) {
                                    listaDeUsuarios.deleteById(userId);
                                    System.out.println("Usuário deletado com sucesso!");
                                }
                            } else {
                                System.out.println("Usuário não encontrado.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("ID inválido.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    scanner.nextLine();
                    ;
            }

        } while (option != 5);

        scanner.close();
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
