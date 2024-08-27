## Comandos úteis do Github

Inicializando diretório local git:

    git init .

Criar branch:

    git branch <nome-branch>
Trocar de branch:

    git switch <nome-branch>
Criar e trocar branch:

    git checkout -b <nome-branch>
Checando o status do diretório local git:

    git status
Adicionar arquivo para commit:

    git add <arquivo>
Adicionar todos os arquivos para commit:

    git add .
Commit

    git commit -m "mensagem do commit"
Listar todos os commits:

    git log
Listar todos os commits abreviados em linha:

    git log --oneline
Adicionar repositório remoto:

    git remote add origin <url-repositorio>
Listar todos os repositórios remotos:

    git remote -v
Associar branch local com repositório local:

    git push -u origin <nome-branch>
Sincronizar branch local com remota:

    git fetch

Comparar diferenças entre branch remota e local

    git diff main origin/main

Mesclar as modificações baixadas com branch local

    git merge origin/main

Atualizar branch local com remota:

    git pull


## Fork + Pull Request

Sequência de passos:

1) Forkar o repositório ORIGINAL pelo próprio GitHub. ele vai criar um REPOSITÓRIO CLONADO no seu perfil
2) Adicionar upstream (repositório remoto) como o ORIGINAL (git remote add upstream "link do ORIGINAL"
3) Fazer um git clone do  REPOSITÓRIO CLONADO na sua máquina
4) Criar uma branch para a feature que se deseja adicionar (git checkout -b "nome da branch")
5) Fazer as modificações estando na branch de feature. adicionar e commitar (git add, git commit -m"")
6)  Dar um git push origin feature-branch
7) Pelo Githb, entrar no repositório original e solicitar pull request. Selecionar sua branch de feature e escrever o que foi modificado
8) Quando a alteração for incorporada, o recomendável é apagar a branch de feature


***Observação:*** Antes de abrir o PR ou quando se deseja atualizar o  REPOSITÓRIO CLONADO, é necessário dar um git fetch e um merge no respositório ORIGINAL para garantir que alterações não tenham sido realizadas (git fetch upstream, git merge upstream/main)