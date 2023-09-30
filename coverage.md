# Coverage Criteria in Software Testing

## Statement Coverage Criterion

Statement coverage refers to executing individual program statements and observing the outcome. Achieving 100% statement coverage means that all statements in the program have been executed at least once. It is the weakest coverage criterion in program testing, and any test suite that falls short of statement coverage for new software is considered unacceptable.

### Coverage Process

- All program statements are represented in a Control Flow Graph (CFG).
- Achieving statement coverage involves selecting a feasible entry-exit path that includes the corresponding CFG nodes, representing the statements.
- Different paths can lead to complete statement coverage.

### Rules for Path Selection

- Select short paths.
- Choose paths of increasingly longer length, unfolding loops if necessary.
- Include arbitrarily long and complex paths.

## Branch Coverage Criterion

A branch is an outgoing edge from a node in the CFG. Complete branch coverage requires selecting paths that include every branch at least once.

### Achieving Branch Coverage

- Covering a branch involves selecting a path that includes the branch.
- Complete branch coverage ensures that every condition evaluates to both true and false at least once.

### Selecting Paths for Branch Coverage

- Different paths are needed to cover all branches, especially those related to independent conditions.

## Predicate Coverage Criterion

Predicate coverage aims to explore paths executed under all possible conditions, focusing on Boolean variables and their evaluations.

### Achieving Predicate Coverage

- Design test cases such that a path is executed under all possible combinations of truth values for conditions affecting that path.
- Ensure that every branch related to Boolean conditions is covered for all possible combinations of truth values.

## Conclusion

Coverage criteria are essential in software testing to ensure that testing adequately explores the codebase. Achieving complete coverage under these criteria helps identify potential issues and increase the reliability of the software.