﻿/*
   Copyright 2021 CrypTool 2 Team <ct2contact@CrypTool.org>

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
namespace CrypTool.CrypAnalysisViewControl
{
    public interface ICrypAnalysisResultListEntry
    {
        /// <summary>
        /// String of the entry's main value to be copied into the clipboard.
        /// </summary>
        string ClipboardValue { get; }

        /// <summary>
        /// String of the entry's key value to be copied into the clipboard.
        /// </summary>
        string ClipboardKey { get; }

        /// <summary>
        /// String of the entry's text value to be copied into the clipboard.
        /// </summary>
        string ClipboardText { get; }

        /// <summary>
        /// String of the whole result entry to be copied into the clipboard.
        /// </summary>
        string ClipboardEntry { get; }
    }
}
