package org.chiguiros.arqsoft.GraphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.chiguiros.arqsoft.GraphQL.Usuario;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsuarioResolver implements GraphQLQueryResolver {

    private final List<Usuario> userList = new ArrayList<>();

    public UsuarioResolver( ) {
        // Assuming some initial user data in the list for demonstration
        userList.add(new Usuario(1, "John"));
        userList.add(new Usuario(2, "Alice"));
    }

    public Usuario datosUsuario ( int id ) {
        // Logic to fetch user data by ID
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
