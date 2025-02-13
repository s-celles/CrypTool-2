﻿/*
   Copyright 2022 CrypTool 2 Team <ct2contact@CrypTool.org>
   Author: Nils Kopal
   Some code adapted from: https://en.wikipedia.org/wiki/Xorshift

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
using System;
using System.Numerics;
using CrypTool.Plugins.RandomNumberGenerator.RandomNumberGenerators;

namespace RandomNumberGenerator.RandomNumberGenerators
{
    internal class NetRandomGenerator : RandomGenerator
    {
        private readonly Random _random;

        /// <summary>
        /// Wrapper around the standard random generator of .net
        /// </summary>
        /// <param name="outputLength"></param>
        public NetRandomGenerator(int outputLength) : base()
        {
            OutputLength = outputLength;
            _random = new Random();
        }

        public NetRandomGenerator(BigInteger seed, int outputLength) : base()
        {
            Seed = seed;
            OutputLength = outputLength;
            _random = new Random((int)seed);
        }

        public override byte[] GenerateRandomByteArray()
        {
            byte[] array = new byte[OutputLength];
            _random.NextBytes(array);
            return array;
        }

        public override void ComputeNextRandomNumber()
        {
            
        }
    }
}
