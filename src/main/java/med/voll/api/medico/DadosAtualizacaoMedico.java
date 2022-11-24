package med.voll.api.medico;

import jakarta.validation.Valid;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

        String nome,
        String telefone,
        @Valid DadosEndereco endereco) {

}
