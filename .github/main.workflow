workflow "CI" {
  resolves = ["Maven Build"]
  on = "push"
}

action "Run Maven Tests" {
  uses = "LucaFeger/action-maven-cli@765e218a50f02a12a7596dc9e7321fc385888a27"
  runs = "mvn"
  args = "clean test"
}

action "Maven Build" {
  uses = "LucaFeger/action-maven-cli@765e218a50f02a12a7596dc9e7321fc385888a27"
  needs = ["Run Maven Tests"]
  runs = "mvn"
  args = "package -Dmaven.test.skip=true"
}
