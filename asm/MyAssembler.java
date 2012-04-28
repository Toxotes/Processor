import java.util.*;
import java.io.*;

class MyAssembler extends Assembler
{

    // The student has to implement it for processing the labels.
    abstract void processLabel(String sourceCode);
	
    // The student has to implement it for generating the machine codes.
    abstract String generateCode(Instruction instruction);
	
    // The student has to implement it for updating the program counter.
    abstract void updateProgramCounter(Instruction instruction);
	
    // The student has to implement it for initializing some of their own variables and data structures.
    abstract void initialization()  throws IOException;	
	
    // The student has to implement it for replacing the labels used in instruction
    abstract void replaceInstructionLabel(Instruction instruction);
	
    // The student has to implement it for replacing the labels used in memory
    abstract void replaceMemoryLabel();
}