# 📘 Trabalho Final POO — Exercícios 3 e 4

📎 **Baixar vídeo de explicação:**
👉 [Clique aqui para baixar o vídeo](./Explicacao_Exercicios3e4.mp4)

## 🎯 **Visão Geral do Projeto**
Este projeto contém a implementação completa e comentada dos **Exercícios 3 e 4** da disciplina de **Programação Orientada a Objetos 1 (POO1)**. 

A estrutura fornecida pelo aluno é:
```
TrabalhoFinalPOO1_exe3_4/
 ├── Exercicio3/
 │    └── Pergunta3.java
 └── Exercicio4/
      └── Pergunta4Matriz.java
```
Cada pasta contém a solução correspondente ao exercício pedido em aula.

---

# 🧮 **Exercício 3 — Tratamento de Exceções (Pergunta3)**
O objetivo do Exercício 3 é **ler dois números informados pelo usuário**, realizar a divisão entre eles e **adicionar todo o tratamento de exceções necessário**, garantindo que o programa nunca quebre, mesmo que o usuário digite algo incorreto.

### ✔️ Pontos importantes resolvidos no código
- Uso da classe `Scanner` para entrada de dados.
- Tratamento de erros com `try/catch`.
- Detecção e tratamento de:
  - Entrada inválida (`InputMismatchException`).
  - Divisões por zero.
  - Qualquer erro inesperado (`Exception`).
- Uso de funções auxiliares para garantir entrada correta.

### 🧠 Funcionamento resumido:
1. O usuário tenta digitar dois números.
2. Se digitar algo errado, o programa não quebra: ele pergunta novamente.
3. O divisor nunca pode ser zero.
4. Ao final, o programa exibe o resultado da divisão.

### 🔍 Destaques do código
#### 🔹 Tratamento de entrada inválida
```
catch (InputMismatchException ime) {
    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
    scanner.nextLine();
}
```

#### 🔹 Evitar divisão por zero
```
if (val == 0) {
    System.out.println("O divisor não pode ser zero. Tente novamente.");
}
```

#### 🔹 Captura de erros inesperados
```
catch (Exception e) {
    System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
    e.printStackTrace();
}
```

---

# 📐 **Exercício 4 — Matrizes 3x1 e Subtração (Pergunta4Matriz)**
Este exercício pede explicitamente:

> Criar um método que receba **3 matrizes double 3x1** como parâmetro, calcule a **subtração das duas primeiras** e **coloque o resultado na terceira**.

### ✔️ O que foi implementado
- Matrizes representadas como `double[3][1]`.
- Validação completa para garantir que todas tenham dimensão **3 linhas e 1 coluna**.
- Método `subtrair(a, b, c)` que calcula: 
```
c[i][0] = a[i][0] - b[i][0]
```
- Função auxiliar `is3x1()` que verifica se a matriz foi criada corretamente.
- Tratamento de erros com mensagens claras.

### 🔍 Validação de matrizes
```
if (a == null || b == null || c == null) {
    throw new IllegalArgumentException("Nenhuma matriz pode ser null.");
}
```

### 🔍 Verificação se realmente é 3x1
```
if (!is3x1(a) || !is3x1(b) || !is3x1(c)) {
    throw new IllegalArgumentException("Todas as matrizes devem ter dimensão 3x1.");
}
```

---

# 🎥 **Vídeo de Explicação dos Exercícios**
Para facilitar seu entendimento, preparei um vídeo detalhado explicando:
- A lógica por trás de cada exercício.
- Por que cada parte do código existe.
- Como funcionam os tratamentos de exceções.
- Como funcionam as matrizes 3x1 no Java.

📎 **Baixar vídeo de explicação:**
👉 [Clique aqui para baixar o vídeo](./Explicacao_Exercicios3e4.mp4)

---

# 🎉 **Conclusão**
Este projeto resolve completamente os Exercícios 3 e 4 com:
- Tratamentos de erros robustos.
- Código organizado.
- Comentários claros.
- Método para subtração de matrizes 3x1 com validação.

Se quiser deixo o README ainda mais completo, com:
- Fluxograma  
- Tabela de erros possíveis  
- Diagramas visuais  
- Pseudocódigo  

Basta pedir! ✨
