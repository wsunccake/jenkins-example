package org.foo

class Bar {
    def env
    def steps

    Bar(env, steps) {
        this.env = env
        this.steps = steps
    }

    def barRun(tasks) {
        steps.echo "bar: ${tasks}"
    }
}
