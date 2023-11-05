# **Explicação Técnica**
- O programa consiste em uma classe do tipo ``Enum``, ela cuida das jogadas e verifica as perdas e derrotas
- que cada uma das jogadas poderá apresentar quando lançadas contra o adversário e vice-versa automáticamente.

**Explicação do Adversário**
- O adversário se trata de uma lista com as 3 jogadas, a lista é tratada de forma aleatória e quando
- ela checa, lança um valor do tipo ``String`` que vai ser analisado na próxima etapa.

**Explicação vitória e derrota**
- O fim do jogo é definido por uma checagem da Enum, verificando se o tipo do jogador
- tem sua derrota do tipo do inimigo, se sim o inimigo vence, já a lógica da vitória
- verificamos se o tipo do inimigo é o tipo da vitória do jogador.
