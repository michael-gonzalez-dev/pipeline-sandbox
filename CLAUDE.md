# Pipeline Sandbox

## What this repo is

A minimal sandbox used exclusively by the Media Sage pipeline E2E tests. It exists to exercise the autonomous agent pipeline — not to build real software. There is no product here.

## For PR review responses

- Read the review comment carefully
- Touch **only the file already changed in the PR** — do not open or read other files
- Make the **minimal change requested**: add a code comment, rename a variable, reformat a line
- Do **not** explore the codebase, create new files, or refactor anything unless the comment explicitly asks for it
- Commit, push, re-request review from the original reviewer, then exit

## No test suite

There is no test suite, build pipeline, or CI in this repo. Do not look for one. Do not run Gradle, Maven, or any build tool.

## Do not reference Media Sage

Do not create, reference, or import any Media Sage-specific files or classes (e.g. `NewsApiService`, `MediaSageApiImpl`, `ClaudeApiService`). They do not exist here.
