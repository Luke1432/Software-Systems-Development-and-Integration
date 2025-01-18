# Lab 1 - Version Control Systems

CSCI 2020U: Software Systems Development and Integration

## Overview

In this lab, you will familiarize yourself with Git and GitHub Classroom, engaging in tasks such as creating commits, pulling from and pushing to a remote repository, establishing branches, and ultimately initiating a pull request to merge two branches into a single one. Mastery of these procedures is crucial for effective collaboration within GitHub Classroom.

For your convenience, Git documentation is accessible at https://git-scm.com. Ensure that Git is installed on your machine, and it is recommended to use Git-Bash as your default terminal. Instructions for setting up Git can be found here: https://docs.github.com/en/get-started/quickstart/set-up-git#setting-up-git.

To work with the current and future repositories, you must be capable of cloning them using either HTTPS or SSH. Instructions on setting up cloning via HTTPS or SSH can be found here: https://docs.github.com/en/get-started/quickstart/set-up-git#authenticating-with-github-from-git.

## Git Commands

- How do I clone a repository? `git clone`
- How do I commit changes? ' `git commit`
- How do I switch between branches? `git checkout`
- How do I stage changes? `git add`
- How do I push changes? `git push`
- How do I pull changes? `git pull`

## Part 1: The Basics

Create a new folder in your home directory and name it `csci2020u` or choose a name that you will easily recall. This folder will store all the repositories associated with this course. Additionally, you will need to be familiar with fundamental Linux commands such as `mkdir`, `cp`, `cd`, `ls`, etc. or their Windows equivalent such as `mkdir`, `copy`, `cd`, `dir`, etc.

Then follow the instructions below :

1. Open a terminal.
2. Create a folder named `csci2020u`.
3. Navigate into the `csci2020u` directory.
4. Clone this repository into a folder named `lab01` using the command `git clone <url> [directory?]` which will create the folder if it's not present.
5. Change into the `lab01` directory.
6. Generate a new Java source code file (`.java`) with any name. Add a one-line comment, for example, "this is a Java file."
7. Create a file named `.gitignore` (**it must be named exactly this**).
    - The .gitignore file, also known as the ignore file, prevents files that match specified patterns within the `.gitignore` from being added to the repository.
    - It is a crucial practice to exclude files like binaries, node_modules, etc. to reduce bloat.
8. Add `*.class` to the ignore file.
9. Use the `add` command to stage all your changes.
10. Use the `commit` command to commit your changes with a descriptive message.
11. Finally, `push` your changes to the remote respository.

This entire process mirrors typical day-to-day activities when collaborating with multiple developers or even working individually. A Version Control System (VCS) proves invaluable for tracking project changes efficiently.

## Part 2: Merging Pull Requests

In this section, let's assume you are a junior developer assigned to make some modifications. This is a standard procedure for altering a codebase.

1. Return to the Git terminal.
2. Create a new branch named `development`. See detailed instructions on how to do so here: https://docs.github.com/en/get-started/quickstart/hello-world#creating-a-branch
3. Switch to the newly created `development` branch. See detailed instructions on how to do so here: https://docs.github.com/en/get-started/quickstart/hello-world#making-and-committing-changes
4. Open the `readme.md` file; this is where you'll implement the changes.
5. Under the `Git Commands` heading, respond to all the questions.
   For instance, answer questions like "How do I ...?" by providing the corresponding command enclosed in backticks like so: `put command here using backticks (grave)`.
   
   ***NOTE: Put your answers on the same line***

After addressing all the questions...

1. Use the `add` command to stage all your changes.
2. Use the `commit` command to commit your changes with an appropriate message.
3. Push your changes to the `development` branch using the `push` command.
4. Lastly, navigate to GitHub, where you'll create and merge a pull request between the `development` and `main` branches. See detailed instructions on how to do so here: https://docs.github.com/en/get-started/quickstart/hello-world#opening-a-pull-request and here: https://docs.github.com/en/get-started/quickstart/hello-world#merging-your-pull-request


Do **NOT** delete the `development` branch after the merge.

## How to Submit

### In session

(Preferably)

- Show your local and remote repositories to the TA to prove that you have finished this lab.

### After lab hours

(1 week to submit - before your next lab session)

- Link to your GitHub repository on Canvas
- Screenshots of the command line terminal
- Screenshot your local repository where relevant
- Screenshot your remote repository showing creation, commit, branching, and merging history
- Add screenshots to `README.md`

The TA can provide oral feedback if you do not receive full marks for any lab assignment, but it is most
appropriate to ask the TA for this feedback in a timely fashion (i.e. ask now, not at the end of the term).
