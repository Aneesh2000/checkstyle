package com.puppycrawl.tools.checkstyle.checks.javadoc.javadoctype;

/* Config: default */

/**
 * Some explanation.
 * @param <A> A type param
 * @param <B1> Another type param
 * @param <D123> The wrong type param  // violation
 * @author Nobody
 * @version 1.0
 */
public class InputJavadocTypeTypeParamsTags_1<A,B1,C456 extends Comparable> // violation
{
    /**
     * Some explanation.
     * @param <X> A type param
     * @param <Y1> Another type param
     * @return a string
     */
    public <X, Y1> String doSomething()
    {
        return null;
    }

    /**
     * Some explanation.
     * @param <BB> The wrong type param
     */
    public <Z> void doSomethingElse()
    {
    }

    /**
     * Some explanation.
     * @param aAnEl A parameter
     * @param <L> A type parameter
     */
    public <L> void doSomethingElse2(L aAnEl)
    {
    }

    /**
     * Example inner class.
     * @param <A> documented parameter
     * @param <C> extra parameter    // violation
     */

    public static class InnerClass_1<A,B> // violation
    {
    }

    /**
     * Some explanation.
     * @param <Z The wrong type param
     */
    public <Z> void unclosedGenericParam()
    {
    }
}

/** @param x */  // violation
class Test_1 {}
