#A Guide to Markdown

#1 - Introduction

##1.1 -  What is Markdown?

Markdown is a simple but powerful way to write rich text-based pages in an intelligible form, and easily convert it to an HTML code for online viewing.  More specifically, it is a plaintext markup language (a method to annotate text that is syntactically distinguishable from the text itself) that converts very easy to read, write, and understand commands into HTML code.  Since HTML is itself a markup language, it is easier to think of a simplification of HTML, allowing a novice in web development to design web pages.  

##1.2 - Why Use Markdown?

Markdown is made for easily converting human readable, simply implemented text files into hard-to-understand HTML.  As such, it is very popular with web applications, as it allows users to develop high-quality web pages without being knowledgeable in developing in HTML.  Many blogging platforms and website builders, such as WordPress, SquareSpace, and Weebly, utilize markdown for page creation.  Markdown is also used to format comments and posts on various popular sites, such as Reddit, Wikipedia for page creation, and the coding collaboration and subversion site GitHub.  Its ease of use and growing reach makes Markdown a useful thing to learn.  Luckily, it is very simple to learn and use.

While it is not as powerful as a word processor or working directly with HTML in web design in terms of formatting and customization of documents and pages, it has several advantages. For one, you can create and edit Markdown files in *any* text editor, including Notepad, Vim, and Emacs. It is much simpler to implement, making it ideal for the web applications which have embraced it.  The Markdown syntax is becoming common in a variety of markup languages as well, making learning it potentially useful across as larger range of tasks.  

##1.3 - When to Not Use Markdown

Markdown is not for complex documents or HTML pages.  It offers no advanced tools common to word processors or more complex markup languages such as LaTex or pure HTML.  One would not write a research paper in Markdown.  

##1.4 - What We Assume About You
Markdown is designed for people that know nothing about HTML, but is robust enough that even those who are more experienced with webpage creation can rely on it. At the very least, you will need to know how to use any text editor and web browser.

#2 - How to Use Markdown

## 2.1 - What You’ll Need
You can use any text editor to write a Markdown documents.  They are customarily saved as text files with an .md or .markdown extension, but this is just convention.  Since it relies only on plaintext, Markdown documents can be written in anything that edits text.

For converting the Markdown into a HTML document, and viewing it as a webpage, a variety of tools exist.  

For full-featured editors, which offer a preview of the final page result side-by-side with the Markdown text, the following are recommended:

MarkDownPad (Windows) - http://www.markdownpad.com
MarkDownPro (OSX) - http://www.markdownpro.com
ReTex (Linux) - http://sourceforge.net/p/retext/home/ReText/

There are also a variety of in-browser Markdown editors, which allow you to export your text as a variety of documents:

StackEdit - https://stackedit.io
Markable - http://markable.in
Markdown Live Editor - http://jrmoran.com/playground/markdown-live-editor/

For a simpler approach, the following tools can convert Markdown into a webpage from the .md text file:

Markdown Here (Chrome and Firefox extension) - http://markdown-here.com
Markdown Preview (Chrome) - https://chrome.google.com/webstore/detail/markdown-preview/jmchmkecamhbiokiopfpnfgbidieafmd

These are just common methods for using Markdown; if none of these are to your liking, a little searching for other Markdown editors or viewers can probably find what you’re looking for.

## 2.2 - How to Markdown

// Have a table of contents/overview of all the features we cover

### 2.2.1 Basic Formatting
Here are some basic formatting techniques to help you get started on your Markdown document.  While Markdown documents may contain HTML tags, they are not conducive to readability, and it is suggested that you instead use their Markdown equivalents.

#### Headings
To create a heading (for titles and subtitles), begin a new line by typing #, followed by your header text.

![Header 1](/img/mdh1.png)

To create subheadings of various sizes, simply place more hashes (#) at the beginning of the line. One hash corresponds to the highest level (ie. largest) of heading, such as a main title or a main section heading, and the smallest heading can be created using six hashes.

![Header 2](/img/mdh2.png)

####Emphasis
Besides using headings, there are other supported ways to emphasize parts of your document using Markdown.

Surround a word or block of text with asterisks (\*) or underscores (\_) to *italicize* it.

![Italics](/img/mditalics.png)

Surround a word or block of text with double asterisks (\*\*) or double underscores to **bold** it.

![Bold](/img/mdbolded.png)

*Note*: You can use either underscores or asterisks in any part of your document, but you cannot mix the two to italicize or bold one block. For example, having `*This*` and `_this_` in the same document is fine, but `*this_` may result in unintended behavior.

####Organization
Markdown is also capable of creating bulleted or numbered lists.

To create a bulleted list, simply add an asterisk (\*) followed by a space to the beginning of each line.

![Bulleted List](/img/compareitem.png)

To create a numbered list, add a number followed by a period (.) and a space to the beginning of each line.

![Numbered List](/img/mdnumbers.png)

*Note*: Markdown *will not preserve the numbers of a list*. That is, if you try to create a numbered list that skips numbers or uses some other ordering (such as going backwards), most Markdown interpreters will simply ignore your numbers and create a list starting from 1.

#### Spacing And Misc.
Markdown’s rules for spacing are probably its least intuitive feature.

End your lines with double spaces in order to create a new line akin to hitting Shift+Enter on a word processor like Microsoft Word..

This is one line
even though it is written on two

However, this line is followed by  
Two spaces.

End your lines with double enter (that is, hit enter twice) to create a completely new line, akin to hitting Enter on a word processor like Microsoft Word.

##3 - Advanced Usage and Troubleshooting

####Links
To insert links into your document, surround the URL with parentheses, and precede it with a suitable word or phrase in square brackets.  

![Link](/img/mdlink.png)

##4 - HARZARDS

##5 - 

