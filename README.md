## Por que faz sentido que a CentralDeAlertas seja um Singleton nesse contexto?

R: Pois existe apenas uma central de comunicação entre os órgãos, além de que todos precisam ter acesso ao mesmo sistema de históricos e ocorrências, 
compartilhar informações importantes e coordenar o serviço entre eles. Singleton garante que essas funcionalidades sejam acessadas por todos os módulos
do sistema. 

---

## Que problemas poderiam acontecer se cada órgão tivesse sua própria instância de central (por exemplo, perder mensagens, históricos diferentes, falta de coordenação)?

R: Complementando a resposta anterior, atraso no atendimento e péssima organização.

---

## Sua implementação é thread-safe? Se não, o que poderia ser feito para torná-la segura em um cenário com múltiplas threads (por exemplo, vários módulos disparando alertas ao mesmo tempo)?

R:Não, para tornar a implementação segura em ambientes concorrentes, poderiam ser usadas
algumas abordagens como:

- método getInstancia() sincronizado (synchronized)
- inicialização antecipada da instância
