/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */

import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;
import exercicios.Cidade;

public class Principal {
    public static void main(final String[] args) {

        CidadeRecord Tocantins = new CidadeRecord("Palmas");
        Cidade Palmas = new Cidade("Palmas");
        PessoaRecordShallow pessoa = new PessoaRecordShallow("Tiago", São Paulo);
        PessoaRecord pessoa2 = new PessoaRecord("Paulo", Rio de Janeiro  );
    }
}
