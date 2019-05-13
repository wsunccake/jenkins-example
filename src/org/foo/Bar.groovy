package org.foo

class Bar {
    def steps

    Bar(steps) {
        this.steps = steps
    }

    def barRun(tasks) {
        steps.echo "bar: ${tasks}"
    }
}
