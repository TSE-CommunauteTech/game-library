# game-library
Bibliothèque de jeux simples pour découvrir, étudier et pratiquer des concepts de bonnes pratiques de développement (TDD, refactoring, pair-programming, versionning, nomenclature…) ainsi que d'autres aspects d'un projet (DevOps)

## Concepts abordés

### TDD
Test-Driven Development (TDD), ou Développements Pilotés par les Tests en français, est une méthode de développement de logiciel, qui consiste à concevoir un logiciel par petits pas, de façon itérative et incrémentale, en écrivant chaque test avant d'écrire le code source et en remaniant le code continuellement.

Il existe **3 lois** inviolables pour pratiquer le TDD :

- Il faut écrire un test qui échoue avant de pouvoir écrire le code de production correspondant
- Il faut écrire une seule assertion à la fois, qui fait échouer le test ou qui échoue à la compilation
- Il faut écrire le minimum de code de production pour que l'assertion du test actuellement en échec soit satisfaite

De ces lois découle un processus cyclique constitué de 5 étapes et réitérable jusqu'à la résolution du problème:

1) écrire un seul test qui décrit une partie du problème à résoudre
2) vérifier que le test échoue, autrement dit qu'il est valide, c'est-à-dire que le code se rapportant à ce test n'existe pas
3) écrire juste assez de code pour que le test réussisse
4) vérifier que le test passe, ainsi que les autres tests existants
5) remanier le code, c'est-à-dire l'améliorer sans en altérer le comportement

![Cycle TDD](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Cycle-global-tdd.png/220px-Cycle-global-tdd.png)

### Principaux intérêts
- permet d'éviter des modifications de code sans lien avec le but recherché, car on se focalise étape par étape sur la satisfaction d'un besoin, en conservant le cap du problème d'ensemble à résoudre
- permet d'éviter les accidents de parcours, où des tests échouent sans qu'on puisse identifier le changement qui en est à l'origine, ce qui aurait pour effet d'allonger la durée d'un cycle de développement
- permet de maîtriser le coût des évolutions logicielles au fil du temps, grâce à une conception du code perméable au changement
- permet de s'approprier plus facilement n'importe quelle partie du code en vue de le faire évoluer, car chaque test ajouté dans la construction du logiciel explique et documente le comportement du logiciel en restituant l'intention des auteurs
- permet de livrer une nouvelle version d'un logiciel avec un haut niveau de confiance dans la qualité des livrables, confiance justifiée par la couverture et la pertinence des tests à sa construction