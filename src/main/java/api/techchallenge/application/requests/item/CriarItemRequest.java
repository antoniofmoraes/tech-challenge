package api.techchallenge.application.requests.item;

import lombok.Data;

import java.util.UUID;

@Data
public class CriarItemRequest {
    private UUID pedidoId;
    private UUID produtoId;
    private String observacoes;
    private int quantidade;
}
