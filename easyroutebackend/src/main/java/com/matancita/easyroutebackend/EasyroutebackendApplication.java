package com.matancita.easyroutebackend;

import com.matancita.easyroutebackend.dao.ClienteDao;
import com.matancita.easyroutebackend.dao.CobradorDao;
import com.matancita.easyroutebackend.dao.EmpresaDao;
import com.matancita.easyroutebackend.dao.GastoDao;
import com.matancita.easyroutebackend.dao.LogsDao;
import com.matancita.easyroutebackend.dao.PagareDao;
import com.matancita.easyroutebackend.dao.PrestamoDao;
import com.matancita.easyroutebackend.dao.RecibosGenDao;
import com.matancita.easyroutebackend.dao.RolDao;
import com.matancita.easyroutebackend.dao.RutaDao;
import com.matancita.easyroutebackend.dao.UsuarioDao;
import com.matancita.easyroutebackend.dao.ZonaDao;
import com.matancita.easyroutebackend.domain.Cliente;
import com.matancita.easyroutebackend.domain.Cobrador;
import com.matancita.easyroutebackend.domain.Empresa;
import com.matancita.easyroutebackend.domain.Gasto;
import com.matancita.easyroutebackend.domain.Logs;
import com.matancita.easyroutebackend.domain.Pagare;
import com.matancita.easyroutebackend.domain.Prestamo;
import com.matancita.easyroutebackend.domain.RecibosGen;
import com.matancita.easyroutebackend.domain.Rol;
import com.matancita.easyroutebackend.domain.Ruta;
import com.matancita.easyroutebackend.domain.Usuario;
import com.matancita.easyroutebackend.domain.Zona;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyroutebackendApplication implements CommandLineRunner {
    
        
        
        @Autowired
        private EmpresaDao empresadao;
        @Autowired
        private RolDao roldao;
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
        
        Empresa empresa = new Empresa("Invermanuel", "Matancitas, general #70", "8096662222", "matan@gmail.com");
        empresadao.save(empresa);
        Cobrador cobrador = new Cobrador("Manuel", "Sarante", "1432412", "Calle General", "21212123", LocalDateTime.now());
        cobradordao.save(cobrador);
        
        System.out.println("cobrador = " + cobrador.getIdCobrador()+" " + cobrador.getApellido());
        System.out.println("Empresa = " + empresa.getIdEmpresa()+" "+ empresa.getDireccion());
        Usuario usuario = new Usuario("Matancita", "hola", 1, empresa, cobrador);
        usuariodao.save(usuario);
        roldao.save(new Rol("ADMIN", usuario));
        roldao.save(new Rol("USER", usuario));
        Zona zona = new Zona("PUERTO PLATA", "Centro", 1);
        zonadao.save(zona);
        Ruta ruta = new Ruta("Pascuala", "MARTES", zona, cobrador);
        rutadao.save(ruta);
        Cliente cliente = new Cliente("Colson", "Perez", "32142341", "Calle duarte", LocalDateTime.now(), "Escuela", "3142412", "2341234", "234523", "perez@gmail.com", "Fontanero", "Julio Arias", "Es buen paagdor", LocalDateTime.now(), 1, ruta);
        clientedao.save(cliente);
        Prestamo prestamo = new Prestamo(LocalDateTime.now(), 30000, "SEMANAL_13", LocalDateTime.now(), 9000, 13, 1, cliente);
        prestamodao.save(prestamo);
        RecibosGen recibosGen = new RecibosGen(LocalDateTime.now(), 3000);
        recibosgendao.save(recibosGen);
        pagaredao.save(new Pagare(1, 200, 300, 500, LocalDateTime.now(), prestamo, recibosGen));
        logsdao.save(new Logs("Did Login", LocalDateTime.now(), usuario));
        gastodao.save(new Gasto("Gasolina", 3000, LocalDateTime.now(), cobrador));
        
        
        
        
        
    }

}
