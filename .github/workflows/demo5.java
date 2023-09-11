jobs:
  build:
    strategy:
      matrix:
        os: [ ubuntu-latest, macos-latest, windows-latest ]
    runs-on: ${{ matrix.os }}
    steps:
      - uses: actions/checkout@v3
      - id: hello
        uses: sormuras/hello-world-java-action@v1
        with:
          who-to-greet: 'Mona the Octocat'
      - run: echo random-number ${{ steps.hello.outputs.random-number }}
        shell: bash
