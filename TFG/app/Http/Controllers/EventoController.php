<?php

namespace App\Http\Controllers;

use App\Models\Evento;
use Illuminate\Http\Request;

class EventoController extends Controller
{
    public function all(Request $request)
    {


        return Evento::when($request->ciudad, fn($q) =>
            $q->where('ciudad', $request->ciudad))
            ->when($request->nombre, fn($q) =>
                $q->where('nombre', 'like', "%{$request->nombre}%"))
            ->when($request->fechaInicio, fn($q) =>
                $q->whereDate('fechaInicio', $request->fechaInicio))
            ->get();

    }


}
