/*
 * JCuda - Java bindings for NVIDIA CUDA jcuda.driver and jcuda.runtime API
 *
 * Copyright (c) 2009-2012 Marco Hutter - http://www.jcuda.org
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package jcuda.driver;

/**
 * Shared memory configurations
 */
public class CUsharedconfig
{
    /**
     * Set default shared memory bank size 
     */
    public static final int CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE    = 0x00;
    
    /**
     *  Set shared memory bank width to four bytes 
     */
    public static final int CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE  = 0x01;
    
    /** 
     * Set shared memory bank width to eight bytes 
     */
    public static final int CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE = 0x02;  

    /**
     * Returns the String identifying the given CUsharedconfig
     *
     * @param n The CUsharedconfig
     * @return The String identifying the given CUsharedconfig
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE: return "CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE";
            case CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE: return "CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE";
            case CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE: return "CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE";
        }
        return "INVALID CUsharedconfig: "+n;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private CUsharedconfig()
    {
    }

}



