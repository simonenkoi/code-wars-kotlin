/**
 * An integral:
 *
 * \int_{a}^{b}f(x)dx
 *
 * can be approximated by the so-called Simpson’s rule:
 *
 *  \frac{b-a}{3n}(f(a)+f(b)+4\sum_{i=1}^{n/2}f(a+(2i-1)h)+2\sum_{i=1}^{n/2-1}f(a+2ih))
 *
 * Here h = (b-a)/n, n being an even integer and a <= b. We want to try Simpson's rule with the function f:
 *
 * f(x) = \frac{3}{2}sin^3x
 *
 * The task is to write a function called simpson with parameter n which returns the value of the integral of f
 * on the interval  \left [ \right 0,\pi\left \right ] .
 *
 * Don't round or truncate your results. See in "RUN EXAMPLES" the function assertFuzzyEquals or testing. n will
 * always be even.
 *
 * Note: we know that the exact value of the integral of f on the given interval is 2.
 */
package simpsons_rule_approximate_integration;