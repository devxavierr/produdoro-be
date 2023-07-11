package dev.wakandaacademy.produdoro.pomodoro.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "ConfiguracaoPadrao")
@Getter
public class ConfiguracaoPadrao {
    private static final String CODIGO_DEFAULT = "DEFAULT";
    @Builder.Default
    @MongoId(targetType = FieldType.STRING)
    private String codigo = CODIGO_DEFAULT;
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;
}
