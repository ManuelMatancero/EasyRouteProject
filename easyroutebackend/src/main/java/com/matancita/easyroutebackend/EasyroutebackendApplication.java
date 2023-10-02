package com.matancita.easyroutebackend;

import com.matancita.easyroutebackend.dao.*;
import com.matancita.easyroutebackend.domain.*;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyroutebackendApplication implements CommandLineRunner {
    
        
        
        @Autowired
        private EmpresaDao empresadao;
        @Autowired
        private LogsDao logsdao;
        @Autowired
        private UsuarioDao usuariodao;
        @Autowired
        private CobradorDao cobradordao;
        @Autowired
        private GastoDao gastodao;
        @Autowired
        private ZonaDao zonadao;
        @Autowired
        private RutaDao rutadao;
        @Autowired
        private ClienteDao clientedao;
        @Autowired
        private PrestamoDao prestamodao;
        @Autowired
        private PagareDao pagaredao;
        @Autowired
        private RecibosGenDao recibosgendao;

	public static void main(String[] args) {
		SpringApplication.run(EasyroutebackendApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        /*Empresa empresa = new Empresa("Invermanuel", "Matancitas, general #70", "8096662222", "matan@gmail.com");
        empresadao.save(empresa);
        Cobrador cobrador = new Cobrador("Manuel", "Sarante", "1432412", "Calle General", "21212123", LocalDateTime.now());
        cobradordao.save(cobrador);
        System.out.println("cobrador = " + cobrador.getIdCobrador()+" " + cobrador.getApellido());
        System.out.println("Empresa = " + empresa.getIdEmpresa()+" "+ empresa.getDireccion());
        Usuario usuario = new Usuario("matancita", "$2a$10$uDPI7j629qCbuX2DvjZJE.b7cZBHgOpKP4700jAKfAhIQ5UICtNNK", "ADMIN", empresa, cobrador);
        usuariodao.save(usuario);
        Zona zona = new Zona("PUERTO PLATA", "Centro", 1);
        zonadao.save(zona);
        Ruta ruta = new Ruta("Pascuala", "MARTES", zona, cobrador);
        rutadao.save(ruta);
        Cliente cliente = new Cliente("Colson", "Perez", "32142341", "Calle duarte", LocalDateTime.now(), "Escuela", "3142412", "2341234", "234523", "perez@gmail.com", "Fontanero", "Julio Arias", "Es buen paagdor", LocalDateTime.now(), 1, ruta);
        Cliente cliente2 = new Cliente("Colson", "Perez", "32142341", "Calle duarte", LocalDateTime.now(), "Escuela", "3142412", "2341234", "234523", "perez@gmail.com", "Fontanero", "Julio Arias", "Es buen paagdor", LocalDateTime.now(), 1, ruta);
        clientedao.save(cliente);
        clientedao.save(cliente2);
        Prestamo prestamo = new Prestamo(LocalDateTime.now(), 30000, "SEMANAL_13", LocalDateTime.now(), 9000, 13, 1, cliente);
        prestamodao.save(prestamo);
        RecibosGen recibosGen = new RecibosGen(LocalDateTime.now(), 3000);
        recibosgendao.save(recibosGen);
        pagaredao.save(new Pagare(1, 200, 300, 500, LocalDateTime.now(), prestamo, recibosGen));
        logsdao.save(new Logs("Did Login", LocalDateTime.now(), usuario));
        gastodao.save(new Gasto("Gasolina", 3000, LocalDateTime.now(), cobrador));*/
        
        
        
        
        
    }

}
