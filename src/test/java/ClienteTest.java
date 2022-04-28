import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {
 @Test
    void testeClone() throws CloneNotSupportedException {
     Cliente clienteModelo =  new Cliente("","","",new Voo("apt-3325","02:40","28-04-2022","PTN2122",""));
     Cliente cliente1 = clienteModelo.clone();
     Cliente cliente2 = clienteModelo.clone();

     cliente1.setCpf("111.111.111-11");
     cliente2.setCpf("222.222.222-22");

     cliente1.setDataNascimento("01/01/2001");
     cliente2.setDataNascimento("02/02/2002");

     cliente1.setNome("Ourives");
     cliente2.setNome("Ourivas");

     cliente1.getVoo().setPoltrona("A2");
     cliente2.getVoo().setPoltrona("N6");

     Assertions.assertEquals("Cliente : { Nome: Ourives Cpf: 111.111.111-11 Nascimento01/01/2001 voo  Voo : {  aeronave: apt-3325 horario: 02:40 data: 28-04-2022 codigoVoo: PTN2122 poltrona: A2}}",cliente1.toString());
  Assertions.assertEquals("Cliente : { Nome: Ourivas Cpf: 222.222.222-22 Nascimento02/02/2002 voo  Voo : {  aeronave: apt-3325 horario: 02:40 data: 28-04-2022 codigoVoo: PTN2122 poltrona: N6}}",cliente2.toString());
 }
}