# Champions Arena Starter

Welcome to the Battle Arena!

## Instructions

1. Open this folder in VSCode.
2. Write your own Champion, Actions, Relics, Tactics, and Gambits in `src/`.
3. Use `MyChampion.java` as your starting point.

📁 Project Structure
```
ChampionStarter/
├── champions-arena.jar      # Provided by your teacher
├── docs                     # JavaDocs for the Champions Arena
├── src/                     # Your Java source files
│   └── MyChampion.java
├── dist/                    # Compiled .class files (auto-generated)
├── .vscode/                 # VSCode project settings
│   ├── tasks.json           # Compile task (Ctrl+Shift+B)
│   ├── launch.json          # Run task (F5 or ▶)
├── build.sh                 # Optional compile script (Mac/Linux)
```

## Building and Running
### Compile your code:
Use the keyboard shortcut:
```
Ctrl + Shift + B (or ⇧⌘B on Mac)
```
This will:
 - Compile everything in src/
 - Output .class files into bin/
### Run the test dojo
After compiling, start the battle by pressing:
```
F5 or click the ▶ Run button in the top toolbar
```
Your Champion will appear in the selection menu if your compiled .class file is in dist/.

##M aking Your Champion
Rename and open src/MyChampion.java and customize:
 - NAME, maxHealth, attackPower, defensePower
 - getActions() to define your special moves
 - Add subclasses of Action as (not public!) classes to this file too.

In the same folder, you also need to create subclasses of
 - Relic.java
 - Tactic.java
 - Gambit.java
