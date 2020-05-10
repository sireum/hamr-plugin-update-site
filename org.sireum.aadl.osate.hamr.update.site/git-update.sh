#!/usr/bin/env bash
set -e
cd ..
LOC=`git remote get-url --push origin`
read -p "Warning: this will recreate $LOC.  Proceed? " -n 1 -r; echo 
if [[ $REPLY =~ ^[Yy]$ ]]; then
  # Remove the history
  rm -rf .git

  # recreate the repos from the current content only
  git init
  git add .

  DATE=`date +%Y-%m-%d`
  COMMIT_MESSAGE="$DATE release"
  
  read -p "Commit message will be \"$COMMIT_MESSAGE\".  Do you want to provide a custom message? " -n 1 -r; echo
  if [[ $REPLY =~ ^[Yy]$ ]]; then
    read -p "Enter commit message: " -r
    COMMIT_MESSAGE=$REPLY
  fi
  git commit -m "$COMMIT_MESSAGE"

  # push to the github remote repos ensuring you overwrite history
  git remote add origin $LOC
  git push -u --force origin master
fi
