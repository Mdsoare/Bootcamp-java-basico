<h1 align="center">Design Pattern</h1>

<h2> 🛑 O que é Design Pattern? </h2>

<p>Design Pattern (padrão de projeto) é uma solução reutilizável para um problema comum de design de software. 
O objetivo dos padrões de projeto é fornecer uma solução testada e comprovada para um problema específico de design de software que ocorre repetidamente na prática.</p>

<p>Os padrões de projeto são baseados em princípios de design de software que visam tornar o software mais eficiente, escalável, flexível e fácil de manter. 
Existem muitos padrões de projeto diferentes que foram criados ao longo dos anos, cada um abordando um problema específico de design de software. </p>
Alguns exemplos comuns incluem Singleton, Factory Method, Strategy, Observer, Adapter e Decorator.

<p>O padrão Singleton é um dos padrões de projeto mais simples e populares que é usado para garantir que uma classe tenha apenas uma instância e fornece um 
ponto de acesso global a essa instância. Isso é útil em situações em que é importante ter uma única instância de uma classe, como para gerenciar recursos 
compartilhados ou para fornecer acesso a um objeto compartilhado em todo o programa.</p>

<p>Os padrões de projeto são amplamente usados em desenvolvimento de software para fornecer soluções padronizadas para problemas de design comuns e para 
melhorar a qualidade do software. Eles são amplamente utilizados em projetos de grande escala e em equipes de desenvolvimento em que a padronização e a 
reutilização de código são importantes.</p>

<h2> 🛑 Exemplos de implementação com padrão Design Pattern </h2>

<h3>Singleton abordagem "Lazy" (preguiçosa)</h3>

<p>
O objetivo do padrão Singleton é garantir que apenas uma única instância de uma classe seja criada e usada durante toda a execução do programa.
Essa implementação do padrão Singleton é "preguiçosa" porque a instância da classe não é criada até que o método "getNomeDaInstancia()" seja chamado pela primeira vez.
Essa abordagem é útil quando a criação da instância é custosa em termos de recursos ou tempo de processamento, pois evita a criação desnecessária da 
instância até que ela seja realmente necessária.
</p>
<p>
No entanto, essa implementação do padrão Singleton usando a abordagem "Lazy" é suscetível a problemas de concorrência em ambientes multi-threaded, 
em que várias threads podem tentar acessar e modificar a instância da classe simultaneamente. Isso pode resultar na criação de múltiplas instâncias da classe, 
o que viola a premissa do padrão Singleton.
</p>
<p>
Para evitar esse problema, pode ser necessário adicionar sincronização ao método "getNomeDaInstancia()" para garantir que apenas uma única thread possa acessar
e modificar a instância da classe por vez. No entanto, isso pode ter um impacto negativo no desempenho do programa, especialmente se a criação da instância for 
custosa em termos de recursos ou tempo de processamento.
</p>
<p>
Outra alternativa é usar a abordagem "Eager" que será abordada em seguida, em que a instância da classe é criada imediatamente na inicialização da classe, 
em vez de ser criada apenas quando necessário. Isso garante que a instância seja criada apenas uma vez e torna a implementação mais segura em ambientes multi-threaded, 
mas pode aumentar o tempo de inicialização do programa e consumir mais recursos.
</p>

<h3>Singleton Eager (ansiosa)</h3>

<p>
A abordagem "Eager", em que a instância da classe é criada imediatamente na inicialização da classe, em vez de ser criada apenas quando necessário, como no caso da abordagem "Lazy". 
</p>
<p>
Essa abordagem "ansiosa" é mais segura em ambientes multi-threaded, pois a instância é garantida para ser criada apenas uma vez e é acessível de forma segura por todas as threads 
que acessam a classe.
</p>
<p>
No entanto, a abordagem "Eager" pode não ser apropriada se a criação da instância for custosa em termos de recursos ou tempo de processamento, 
pois pode aumentar o tempo de inicialização do programa e consumir mais recursos desnecessariamente. Nesses casos, a abordagem "Lazy" pode ser mais adequada.
</p>

<h3>Singleton LazyHolder </h3>

<p>
Singleton LazyHolder é uma abordagem de implementação do padrão Singleton que aproveita a inicialização tardia e a inicialização segura por meio de classes aninhadas 
estáticas em Java. O objetivo é garantir que a instância do Singleton seja criada apenas quando necessário, mas sem o risco de problemas de concorrência em 
ambientes multi-threaded.
</p>
<p>
Essa abordagem também é conhecida como "initialization on demand holder idiom" em inglês, e é considerada uma das maneiras mais seguras e eficientes de implementar 
o padrão Singleton em Java.
</p>

<h3>Factory Method </h3>

<p>
O padrão Factory Method é um padrão criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de 
objetos que serão criados. O Factory Method é útil quando um objeto precisa ser criado em tempo de execução e não se sabe de antemão qual objeto precisa ser criado.
</p>


<h3>Strategy </h3>

<p>
O padrão Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. 
O Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
</p>

<h3>Observer </h3>

<p>
O padrão Observer é um padrão comportamental que define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, 
todos os seus dependentes são notificados e atualizados automaticamente. Esta abordagem é útil quando se deseja manter vários objetos sincronizados 
com um objeto principal que muda de estado.
</p>
<p>
Este padrão promove o desacoplamento entre os objetos e é amplamente utilizado em interfaces gráficas de usuário e sistemas distribuídos.
</p>

<h3>Adapter </h3>

<p>
O padrão Adapter é um padrão estrutural que permite que duas classes com interfaces incompatíveis trabalhem juntas, atuando como uma ponte entre elas, 
permitindo que trabalhem juntas mesmo que tenham interfaces diferentes. Este padrão converte a interface de uma classe em outra interface que o cliente espera encontrar. 
</p>
<p>
O padrão Adapter é amplamente utilizado em sistemas legados que precisam ser integrados com novos sistemas.
</p>

<h3>Decorator </h3>

<p>
O padrão Decorator é um padrão estrutural que permite adicionar funcionalidades a um objeto dinamicamente, sem alterar a sua estrutura. 
É usado para adicionar funcionalidade a um objeto em tempo de execução, sem afetar outros objetos da mesma classe. 
Ele permite que as funcionalidades sejam adicionadas e removidas de forma dinâmica. 
</p>
<p>
O padrão Decorator é amplamente utilizado em interfaces gráficas de usuário e sistemas de gerenciamento de documentos.
Isso é útil quando se deseja adicionar comportamentos a um objeto de forma dinâmica, sem precisar alterar a sua classe ou criar subclasses adicionais.
</p>


<h2> 📚 Sugestões de Estudos</h2>
<ul>
	<p>Existem diversos materiais sobre Design Patterns. Algumas sugestões são:</p>
	<ol>
		<li>Livro: "Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos", de Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides.</li>
		<li>Curso online: "Design Patterns em Java", da plataforma Alura. Este curso é voltado para programadores que já possuem conhecimento em Java e aborda diversos padrões de projeto. </li>
		<li>Artigos online: Algumas sugestões são o Blog da Caelum, a DevMedia e a Code Heroes. </li>
		<li>Vídeos: no YouTube, algumas sugestões são os canais do Programação Dinâmica e do DevDojo. </li>
	</ol>
</ul>


<h3 align="center">✨ ️Redes Socias</h3>
<p align="center"> 
<a href="https://www.linkedin.com/in/marcelodsoares/">LinkedIn</a> ▪️
<a href="https://github.com/Mdsoare/">GitHub</a>
</p>

<p align="center">Disponibilizado por Marcelo Soares</p>